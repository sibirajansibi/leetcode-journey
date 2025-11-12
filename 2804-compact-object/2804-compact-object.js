/**
 * @param {Object|Array} obj
 * @return {Object|Array}
 */
var compactObject = function(obj) {
  
  
  if (typeof obj !== 'object' || obj === null) {
    return obj;
  }

   // array ah iruntha
  if (Array.isArray(obj)) {
   
    // for every remaining item, recursive ah call pandrom compactObject eh 
    //    to clean up nested arrays/objects.
    return obj.filter(Boolean).map(compactObject);//
  }

  
  const comObj = {}; 
  for (const key in obj) {
    const value = compactObject(obj[key]);
     
    if (Boolean(value)) {
      comObj[key] = value;
    }
  }
  
  return comObj;
};

