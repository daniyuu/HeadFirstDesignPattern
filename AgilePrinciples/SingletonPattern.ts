namespace SingletonPattern {
    export class Singleton {
        private static instance: Singleton;

        constructor(){}

        static get Instance() {
            if (this.instance === null || this.instance === undefined) {
                this.instance = new Singleton();
            }
            return this.instance;
        }
    }

    export namespace Demo {
        
                export function show() : void {
                    var singleton1 = SingletonPattern.Singleton.Instance;
                    var singleton2 = SingletonPattern.Singleton.Instance;
        
                    if (singleton1 === singleton2) {
                        console.log("two singletons are equivalent");
                    } else {
                        console.log("two singletons are not equivalent");
                    }
                }
            }
}