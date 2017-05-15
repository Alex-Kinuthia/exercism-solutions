var DnaTranscriber = function() {

}

DnaTranscriber.prototype = {
  toRna: function(string) {

    var validChars = ['C', 'G', 'A', 'T']


    var newString = ""

    for (char of string) {
      if (validChars.indexOf(char) === -1) {
        throw new Error('Invalid input')
      }

      if (char === 'C') {
        newString += 'G'
      } else if (char === 'G') {
        newString += 'C'
      } else if (char === 'A') {
        newString += 'U'
      } else if (char === 'T') {
        newString += 'A'
      }
    }

    return newString
  }
}

module.exports = DnaTranscriber;
