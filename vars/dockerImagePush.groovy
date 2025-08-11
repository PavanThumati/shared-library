def call(String project, String ImageTag, String hubUser){
    withCredentials([usernamePassword(
            credentialsId: "docker-cred",
            usernameVariable: "USER",
            passwordVariable: "PASS"
    )]) {
        sh '''
        echo "$PASS" | docker login -u "$USER" --password-stdin
    '''
    }
    sh "docker image push ${hubUser}/${project}:${ImageTag} || true"
    sh "docker image push ${hubUser}/${project}:latest || true"   
}
