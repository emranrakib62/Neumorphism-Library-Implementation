<img width="167" alt="image" src="https://github.com/user-attachments/assets/e683de4b-9136-4e2a-951e-f0bd1899428f" />




## 💡 For Neumorphism UI Setup

#### 1.Add the library to your App-level build.gradle:

dependencies {
    implementation 'com.github.fornewid:neumorphism:0.3.0'
}


### 📦 Dependency Setup

#### 2. Add JitPack to `settings.gradle`

If you're using Gradle 7.0+ (with `settings.gradle` instead of `build.gradle`):

```gradle
dependencyResolutionManagement {
    repositories {
        google()
        mavenCentral()
        maven { url "https://jitpack.io" } 
    }
}
