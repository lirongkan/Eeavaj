function getMonth() {

    var char = document.getElementById("month");
        var str =char.value;
    if(str==1||str==3||str==5||str==7||str==8||str==10||str==12){
        alert(31);
    }else if(str==4||str==6||str==9||str==11){
        alert(30);
    }else if(str == 2){
        alert(28);
    }else{
        alert("没有该月份！");
    }
}