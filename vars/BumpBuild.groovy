import org.home.versioning.Version

def call(String version) {
    return Version.bumpBuild(version)
}