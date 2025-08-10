def call(String project, String ImageTag, String dockerHubUserName){
  sh """
    docker image build -t ${dockerHubUserName}/${project} . 
    docker image tag ${dockerHubUserName}/${project} ${dockerHubUserName}/${project}:${ImageTag}
    docker image tag ${dockerHubUserName}/${project} ${dockerHubUserName}/${project}:latest
  """
}
