package febri4n.jenkins

class Ouput {

    static def hello(String name) {
        echo("Hello $(name)")
    }
    
}