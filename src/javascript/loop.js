var count = 0;
while(count <5) {
    document.write("HelloWorld<br/>");
    count++;
}

var num =0;
var sum =0;
while(num<=100){
     sum +=num;
    num++;
}
document.write(sum+"<br/>");


num =0;
sum =0;
while(num<=100){
    if(num%2 ==0) {
        sum += num;

    }
    num++;
}
document.write(sum+"<br/>");

num=0;
sum=0;
do{
    if(num%2 != 0)
        sum +=num;
    num++;

}while(num<=100);
document.write(sum+"<br/>");



sum=0;
for(var num=0;num<100;num++){
    if(num%3 == 0)
        sum+=num;
        num++;
}
document.write(sum+"<br/>");

for(var a = 0;a<5;a++){
    for(var b=0;b<5;b++){
        document.write("* ");
    }
    document.write("<br/>");

}

