plugins {
    alias(libs.plugins.android.application)
}

android {
    namespace = "com.example.avatar_zhanara"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.avatar_zhanara"
        minSdk = 24
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    buildFeatures {
        viewBinding = true
    }
}

dependencies {

    implementation(libs.appcompat)
    implementation(libs.material)
    implementation(libs.constraintlayout)
    implementation(libs.lifecycle.livedata.ktx)
    implementation(libs.lifecycle.viewmodel.ktx)
    implementation(libs.navigation.fragment)
    implementation(libs.navigation.ui)
    testImplementation(libs.junit)
    androidTestImplementation(libs.ext.junit)
    androidTestImplementation(libs.espresso.core)

    implementation ("androidx.room:room-runtime:2.6.1")
    annotationProcessor ("androidx.room:room-compiler:2.6.1")

    //подключение к room database implementation ("android.arch.persistence.room:runtime:1.1.1")
    annotationProcessor ("android.arch.persistence.room:compiler:1.1.1")
    //расширение возможностей фрагмента:
    implementation ("androidx.fragment:fragment:1.6.2")
    // круглое изображение
    implementation ("de.hdodenhof:circleimageview:3.1.0")
}