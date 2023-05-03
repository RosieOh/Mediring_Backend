package com.linked.app.service

import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional
import org.springframework.util.StringUtils
import org.springframework.web.multipart.MultipartFile
import java.awt.Image
import java.awt.Transparency
import java.awt.image.BufferedImage
import java.io.File
import java.io.IOException
import java.nio.file.Files
import java.nio.file.Paths
import java.util.*
import javax.imageio.ImageIO

@Service
class FileStoreService {
    companion object {
        const val maxSize = 2200
        const val targetPath = "./src/main/resources/uploads"
    }

    @Transactional
    fun storeImage(categoryType: String, file: MultipartFile): String? {
        val fileName = StringUtils.cleanPath(file.originalFilename!!)
        val i = fileName.lastIndexOf('.')
        val p = fileName.lastIndexOf(File.separatorChar).coerceAtLeast(fileName.lastIndexOf('\\'))
        var ext = ""
        val fileuid = UUID.randomUUID().toString()
        val basePath = Paths.get(targetPath, "${File.separator}$categoryType")

        try {
            if (Files.notExists(basePath)) {
                Files.createDirectories(basePath)
            }
        } catch (e: IOException) {
            e.printStackTrace()
        }

        if (i > p) {
            ext = fileName.substring(i + 1).toLowerCase()
        }
        try {
            val ins = file.inputStream
            val bufImage = ImageIO.read(ins)

            val width = bufImage.width
            val height = bufImage.height

            val imgType = if (bufImage.transparency == Transparency.OPAQUE) {
                BufferedImage.TYPE_INT_RGB
            } else {
                BufferedImage.TYPE_INT_ARGB
            }
            val resizeImage = bufImage.getScaledInstance(width, height, Image.SCALE_SMOOTH)
            val newImage = BufferedImage(width, height, imgType)
            val graphics = newImage.graphics
            graphics.drawImage(resizeImage, 0, 0, null)
            graphics.dispose()
            ImageIO.write(newImage, ext, Files.newOutputStream(basePath.resolve(fileuid)))

            return "${targetPath.replace(".", "").replace("/src/main/resources", "")}${File.separator}$categoryType${File.separator}$fileuid"
        } catch(e: IOException) {
            e.printStackTrace()
        }
        return null
    }
}