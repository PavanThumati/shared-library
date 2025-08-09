def call(Map parameters){
  checkout([
        $class: 'GitSCM',
        branches: [[name:  parameters.branch ]],
        userRemoteConfigs: [[ url: parameters.url ]]
    ])
  }
