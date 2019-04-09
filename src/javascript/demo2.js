function Person(name,id){
    this.name=name;
    this.id=id;
}
var p = new Person("A","001");

    document.write(p.id+" "+p.name);

    document.write("<hr>")

with(p){
        document.write(id+" "+name+"<br/>");
}

function add(a,b){
        var sum = a +b;
        // document.write(sum);
    return sum;
}
add(1,2)


