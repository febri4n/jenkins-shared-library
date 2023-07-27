package febri4n.jenkins;

class Output {

    static def hello(Steps, String name) {
        steps.echo("Hello ${name}")
    }

}