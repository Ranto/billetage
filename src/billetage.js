function billetage(somme) {
    var ten, five = 0, two = 0;
    var q10 = Math.floor(somme / 10);
    var found = false;
    for (ten = q10; ten >= 0; ten--) {
        var reste5 = reste(somme, 10, ten);
        if (reste5 > 0) {
            var q5 = Math.floor(reste5 / 5);
            for (five = q5; five >= 0; five--) {
                var reste2 = reste(reste5, 5, five);
                if (reste2 > 0) {
                    var q2 = Math.floor(reste2 / 2);
                    for (two = q2; two >= 0; two--) {
                        var rst = reste(reste2, 2, two);
                        if (rst == 0) {
                            found = true;
                            break;
                        }
                    }
                } else {
                    found = true;
                    break;
                }
                if (found) {
                    break;
                }
            }
        } else {
            found = true;
            break;
        }

        if (found) {
            break;
        }
    }

    if (found) {
        return {
            ten: ten,
            five: five,
            two: two
        };
    } else {
        return null;
    }
}

function reste(somme, diviseur, quotient) {
    return somme - (diviseur * quotient);
}

var s = billetage(21);
console.log(s);