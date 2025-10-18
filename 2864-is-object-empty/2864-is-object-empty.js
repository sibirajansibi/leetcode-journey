/**
 * @param {Object|Array} obj
 * @return {boolean}
 */
var isEmpty = function(obj) {

  for(let key in obj) {
    if (obj.hasOwnProperty(key)) {
      return false;
    }
  }
  
  
  return true; 
};