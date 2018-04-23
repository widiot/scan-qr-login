function GUID() {
    function S4() {
        return (((1 + Math.random()) * 0x10000) | 0).toString(16).substring(1);
    }

    return (S4() + S4() + "-" + S4() + "-" + S4() + "-" + S4() + "-" + S4() + S4() + S4());
}

var guid = GUID();
var qrcode = new QRCode('qrcode', {
    width: 150,
    height: 150,
    colorDark: '#000000',
    colorLight: '#ffffff',
});
qrcode.makeCode(guid);

var xmlHttp;
if (window.XMLHttpRequest) {
    xmlHttp = new XMLHttpRequest();
} else {
    xmlHttp = new ActiveXObject("Microsoft.XMLHTTP");
}
function polling() {
    xmlHttp.onreadystatechange = function () {
        if (xmlHttp.status == 200 && xmlHttp.readyState == 4) {
            var result = xmlHttp.responseText;
            if (result == 'true') {
                window.location.href = '/userLogin/user/checkLogin';
            }
        }
    }
    xmlHttp.open("GET", "/userLogin/user/scanQR?guid=" + guid, true);
    xmlHttp.send();
}

setInterval("polling()", 1000);