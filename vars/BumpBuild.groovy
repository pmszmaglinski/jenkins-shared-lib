import org.home.versioning.Version

def call(String version) {
    Version.bumpBuild(version)
}