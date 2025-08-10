def call(){
    //sh 'mvn test'
    sh 'mvn test --add-opens jdk.compiler/com.sun.tools.javac.processing=ALL-UNNAMED'

}
