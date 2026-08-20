export function converterToCaps(text){
    if(text.trim()===""){
        throw new Error("File has no text to convert");
    }
    return text.toUpperCase();
}