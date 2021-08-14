package org.home.versioning

class Version {
   
   static String version

   public static String bumpBuild(String version) {
      this.version = version
      String pattern = ~/(\d{1,3})\.(\d{1,3})\.(\d{1,3}).(\d{1,4})$/
      this.version = version.replaceFirst(pattern) { it[1] + '.' + it[2] + '.' + it[3] + '.' + ((it[4] as int) +1) }
      return this.version
    }
  
    public static String bumpPatch(String version) {
      this.version = version
      String pattern = ~/(\d{1,3})\.(\d{1,3})\.(\d{1,3}).(\d{1,4})$/
      String newVersion = version.replaceFirst(pattern) { it[1] + '.' + it[2] + '.' + ((it[3] as int) + 1) + '.' +  '0' }
      return newVersion
    }

    public static String bumpMinor(String version) {
      this.version = version
      String pattern = ~/(\d{1,3})\.(\d{1,3})\.(\d{1,3}).(\d{1,4})$/
      String newVersion = version.replaceFirst(pattern) { it[1] + '.' + ((it[2] as int) +1) + '.' + '0' + '.' +  '0' }
      return newVersion
    }
    
    public static String bumpMajor(String version) {
      this.version = version
      String pattern = ~/(\d{1,3})\.(\d{1,3})\.(\d{1,3}).(\d{1,4})$/
      String newVersion = version.replaceFirst(pattern) { ((it[1] as int) +1) + '.' + '0' + '.' + '0' + '.' + '0' }
      return newVersion
    }
}
