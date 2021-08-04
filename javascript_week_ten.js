function spinalCase(string){
    return string.split(/\s|_|(?=[A-Z])/).join("-").toLowerCase();
}

console.log(spinalCase("This is a spinal tap function"))