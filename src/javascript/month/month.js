function showDay(){
    var inputObj =document.getElementById("month");
    var month = inputObj.value;

    month =parseInt(month);
    switch(month){
        case 1:
        case 3:
        case 5:
        case 7:
        case 8:
        case 10:
        case 12:
            alert("本月有31天");
            break;
        case 4:
        case 6:
        case 9:
        case 11:
            alert("本月有30天");
            break;
        case 2:
            alert("闰年29天，非闰年28天");
            break;
        default:
            alert("没有该月份！");
            break;

    }
}