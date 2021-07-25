#!groovy
import org.cicd.tools
import org.cicd.ansible


def call(hosts){
def tools = new tools()
//tools指代的是src/org/devops/tools.groovy脚本文件

def ansible = new ansible()

pipeline
{
     agent {  label "master"  }
     
     stages{
         stage("build"){
           steps {
              script {
             
                ansible.AnsibleDeploy("${hosts}","-m ping")      
                 
              }
            }
         }
     }
     
     
   post {
        always {
             script{
                  tools.PrintMes("1.1.1.1")
             }
        }
   }     
}
}
