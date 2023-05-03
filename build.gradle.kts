import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

val genDir = "$projectDir/src/main/kotlin"
val jooqDriver = "com.mysql.cj.jdbc.Driver"
val jooqUrl = "jdbc:mysql:/localhost:3306/mediring"
val jooqUserName = "root"
val jooqPassword = "root"

val querydslVersion = "5.0.0"

plugins {
    val kotlinVersion = "1.3.72"

    id("org.springframework.boot") version "2.1.4.RELEASE"
    id("io.spring.dependency-management") version "1.0.10.RELEASE"
    id("dev.bombinating.jooq-codegen") version "1.7.0"
//    id("org.flywaydb.flyway") version "6.5.5"

    kotlin("jvm") version kotlinVersion
    kotlin("plugin.spring") version kotlinVersion
    kotlin("plugin.jpa") version kotlinVersion
    kotlin("plugin.allopen") version kotlinVersion
    kotlin("kapt") version kotlinVersion
}

group = "com.linked"
version = "0.2.1"
java.sourceCompatibility = JavaVersion.VERSION_11

repositories {
    mavenCentral()
//    jcenter()
    maven {
        url = uri("https://maven.springframework.org/release")
    }
    maven {
        url = uri("https://maven.restlet.com")
    }
}

sourceSets["main"].java {
    srcDir(genDir)
}

allOpen {
    annotation("javax.persistence.Entity") // @Entity가 붙은 클래스에 한해서만 all open 플러그인을 적용
}

noArg {
    annotation("javax.persistence.Entity") // @Entity가 붙은 클래스에 한해서만 no arg 플러그인을 적용
}

dependencies {
    // spring boot framework library
    implementation("org.springframework.boot:spring-boot-starter-jdbc")
    implementation("org.springframework.boot:spring-boot-starter-web")
    implementation("org.springframework.boot:spring-boot-starter-webflux")
    implementation("org.springframework.security.oauth.boot:spring-security-oauth2-autoconfigure:2.1.4.RELEASE")
    implementation("org.springframework.boot:spring-boot-starter-test")
    implementation("io.sentry:sentry-spring:1.7.30")

    // thymeleaf
    implementation("org.springframework.boot:spring-boot-starter-thymeleaf")
    implementation("nz.net.ultraq.thymeleaf:thymeleaf-layout-dialect")
    implementation("org.thymeleaf.extras:thymeleaf-extras-springsecurity5")
    // thymeleaf

    implementation("org.springframework.boot:spring-boot-starter-security")
    implementation("org.springframework.boot:spring-boot-devtools")
    // spring boot framework library

    implementation("commons-io:commons-io:2.6")

    // jwt
//    implementation("io.jsonwebtoken:jjwt:0.9.1")
//    runtimeOnly("org.glassfish.jaxb:jaxb-runtime")
    // jwt

    // swagger
//    implementation("io.springfox:springfox-swagger2:2.9.2")
//    implementation("io.springfox:springfox-swagger-ui:2.9.2")
    // swagger

    implementation("org.jetbrains.kotlin:kotlin-reflect")
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")
    implementation("org.modelmapper:modelmapper:2.3.0")

    // Google Commons - Guava
    implementation("com.google.guava:guava:31.0.1-jre")

    // Postgres
//    implementation("org.postgresql:postgresql:42.2.11")
    // Postgres
    runtimeOnly("mysql:mysql-connector-java")

    // jpa
    implementation("org.springframework.boot:spring-boot-starter-data-jpa")
    implementation("com.fasterxml.jackson.module:jackson-module-kotlin")
    runtimeOnly("com.h2database:h2")
    implementation("com.querydsl:querydsl-jpa:$querydslVersion")
    implementation ("com.querydsl:querydsl-core:${querydslVersion}")
    kapt("com.querydsl:querydsl-apt:$querydslVersion:jpa")
    kapt("org.springframework.boot:spring-boot-configuration-processor")
    sourceSets.main {
        withConvention(org.jetbrains.kotlin.gradle.plugin.KotlinSourceSet::class) {
            kotlin.srcDir("$buildDir/generated/source/kapt/main")
        }
    }
    // jpa

    // jsession
    implementation("org.springframework.session:spring-session-core")

    testImplementation("org.junit.jupiter:junit-jupiter-api:5.2.0")
    testCompile("org.junit.jupiter:junit-jupiter-params:5.2.0")
    testRuntime("org.junit.jupiter:junit-jupiter-engine:5.2.0")
    testImplementation("org.springframework.boot:spring-boot-starter-test")
    //    implementation("org.flywaydb:flyway-core:6.5.5")

    // Google Commons - Guava
    implementation("com.google.guava:guava:31.0.1-jre")
    implementation("com.google.code.gson:gson:2.9.1")
}

tasks.withType<Test> {
    useJUnitPlatform()
}

tasks.withType<KotlinCompile> {
    kotlinOptions {
        freeCompilerArgs = listOf("-Xjsr305=strict")
        jvmTarget = "11"
    }
}