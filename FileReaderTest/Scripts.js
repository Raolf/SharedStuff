
var text = "clear";
var textArray = [];
readText();

function readText() {
    $.get("Data.txt", function (data) {
        text = data;

        textArray = $.csv.toArrays(text);
        var textForm = "";


        for(var i = 0; i<textArray.length; i++){


            for(var z = 0; z<textArray[i].length; z++){
                textForm += textArray[i][z];
            }


            textForm += "\r\n";
        }


        document.getElementById("text").innerText = textForm;
    });



    return false;
}