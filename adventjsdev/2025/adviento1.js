function filterGifts(gifts) {
    let array = []
  for(i of gifts.values()) {
    if(!i.includes('#')){
      array.push(i)
    }
  }

  return array
}

const gifts1 = ['car', 'doll#arm', 'ball', '#train']
const good1 = filterGifts(gifts1)
console.log(good1)
// ['car', 'ball']

const gifts2 = ['#broken', '#rusty']
const good2 = filterGifts(gifts2)
console.log(good2)
// []

const gifts3 = []
const good3 = filterGifts(gifts3)
console.log(good3)