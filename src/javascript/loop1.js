for(var a =0;a<10;a++){
    for(var b=0;b<=a;b++){
        document.write("@     ");//若有10个连续空格，只会保留一个
    }
    document.write("<br/>");
}


for(var a=1;a<=5;a++){
    for(var b=1;b<=a;b++){
        document.write(a+" *"+b+"="+a*b +"    ");
    }
    document.write("<br/>");
}

document.write("<br/>");

var arr  =[1,2,3,4,23,24];

for(var a  in arr){
    document.write(arr[a]+" ");
}

document.write("<hr>");
for(var a =0;a<arr.length;a++){
    document.write(arr[a]+" ");
}

document.write("<hr>");


var arr =[3,4,7,9];
for(var a in arr){
    document.write(arr[a]+" ");

}

document.write("<hr>");
for(var a = 0;a<arr.length;a++){
    document.write(arr[a]+" ");
}

document.write("<hr>");
function Person(id,name){
    this.id=id;
    this.name=name;
}
var p =new Person("1","anshi");
for(var pro in p){
    document.write(p[pro]);
}