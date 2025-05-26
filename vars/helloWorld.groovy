def call() {
  def mvnHome = tool 'Maven3'
  sh "${mvnHome}/bin/mvn clean"
}
