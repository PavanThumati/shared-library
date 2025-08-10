def call() {
  
    withEnv([
      'MAVEN_OPTS=--add-exports=jdk.compiler/com.sun.tools.javac.util=ALL-UNNAMED --add-exports=jdk.compiler/com.sun.tools.javac.api=ALL-UNNAMED'
    ]) {
      sh 'mvn test'
    }
  
}
