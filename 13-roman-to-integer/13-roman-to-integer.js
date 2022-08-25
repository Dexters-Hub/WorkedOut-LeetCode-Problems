/**
 * @param {string} s
 * @return {number}
 */
var romanToInt = function(s) {
    let conversion = {"I": 1, "V":5,"X":10,"L":50,"C":100,"D":500,"M":1000};
    let total = 0;
    
    for (let i = 0; i < s.length; i++) {
        
        total += conversion[s[i]];
        
        if (i > 0 && conversion[s[i]] > conversion[s[i - 1]]) 
            total -= 2 * conversion[s[i - 1]];
    }
    return total;
};