function decodeSantaPin(code) {
    //code here
    let nuevo = "";
    codigo = code.split(']').filter(Boolean);
    if (codigo.length < 4) nuevo = null;
    else {
        for (let i = 0; i < codigo.length; i++) {
            let numero = codigo[i][1];
            if (codigo[i][1] === '<') {
                numero = nuevo[nuevo.length - 1];
            }
            else if (codigo[i].length > 2) {
                for (let j = 2; j < codigo[i].length; j++) {
                    if (codigo[i][j] === '+') {
                        if (numero == 9) numero = 0;
                        else numero = (parseInt(numero) + 1);
                    }
                    else if (codigo[i][j] === '-') {
                        if (numero == 0) numero = 9;
                        else numero = (parseInt(numero) - 1);
                    }
                }
                numero = numero.toString();
            }
            nuevo += numero;
        }
    }
    return nuevo;
}

const prueba1 = decodeSantaPin('[1++][2-][3+][<]')
console.log(prueba1)
// "3144"

const prueba2 = decodeSantaPin('[9+][0-][4][<]')
console.log(prueba2)
// "0944"

const prueba3 = decodeSantaPin('[1+][2-]')
console.log(prueba3)
// null (solo 2 dígitos)