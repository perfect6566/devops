package org.cicd.ansible


def AnsibleDeploy(hosts,func){
   echo "i am running inside AnsibleDeploy ${hosts}"
   sh "ansible ${func} ${hosts}"


}

