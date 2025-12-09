var name1 = "Rahul";
console.log("name=" + name1);
// document.writeln("name="+name1);

function add(a: number, b: number): number {
    if (a < 0 || b < 0) {
        console.log("-ve values not allowed");
        return 0;
    }
    else {
        let sum = a + b;
        return sum;
    }
}

console.log("sum=" + add(10, -20));

const person1 = { name: "Abc", age: 10 };

console.log("person1 : " + person1.name + " , " + person1.age);
