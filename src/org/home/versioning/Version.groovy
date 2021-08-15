package org.home.versioning

class Version implements Serializable {
   
    private static String version
    private static String pattern = ~/(\d{1,3})\.(\d{1,3})\.(\d{1,3}).(\d{1,4})$/

    static String bumpBuild(String version) {
      this.version = version
      this.version = version.replaceFirst(pattern) { it[1] + '.' + it[2] + '.' + it[3] + '.' + ((it[4] as int) +1) }
      return this.version
    }

    static String bumpPatch(String version) {
      this.version = version
      String newVersion = version.replaceFirst(pattern) { it[1] + '.' + it[2] + '.' + ((it[3] as int) + 1) + '.' +  '0' }
      return newVersion
    }

    static String bumpMinor(String version) {
      this.version = version
      String newVersion = version.replaceFirst(pattern) { it[1] + '.' + ((it[2] as int) +1) + '.' + '0' + '.' +  '0' }
      return newVersion
    }

    static String bumpMajor(String version) {
      this.version = version
      String newVersion = version.replaceFirst(pattern) { ((it[1] as int) +1) + '.' + '0' + '.' + '0' + '.' + '0' }
      return newVersion
    }
}

