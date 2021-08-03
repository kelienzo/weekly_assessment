function arrayDiff (array1, array2) {

    let arrays = []; let arrayDiff = [];

    for (let i = 0; i < array1.length; i++) {
        arrays[array1[i]] = true;
    }

    for (let i = 0; i < array2.length; i++) {
        if (arrays[array2[i]]) {
            delete arrays[array2[i]];
        } else {
            arrays[array2[i]] = true;
        }
    }

    for (let all in arrays) {
        arrayDiff.push(all);
    }
    return arrayDiff;
}
console.log(arrayDiff([2,3,4,5,6,7,1], [2,1,4,5,7,8,9,6,]))