function manufactureGifts(giftsToProduce) {
  // Code here
  let array = []
  for(let diccionario of giftsToProduce){
    let cantidad = diccionario['quantity']
    if(cantidad > 0 && !isNaN(cantidad)){
      for(let i = 0; i < cantidad; i++){
        array.push(diccionario['toy'])
      }
    }
  }
  return array
}

const production1 = [
  { toy: 'car', quantity: 3 },
  { toy: 'doll', quantity: 1 },
  { toy: 'ball', quantity: 2 }
]

const result1 = manufactureGifts(production1)
console.log(result1)
// ['car', 'car', 'car', 'doll', 'ball', 'ball']

const production2 = [
  { toy: 'train', quantity: 0 }, // no se fabrica
  { toy: 'bear', quantity: -2 }, // tampoco
  { toy: 'puzzle', quantity: 1 }
]

const result2 = manufactureGifts(production2)
console.log(result2)
// ['puzzle']

const production3 = []
const result3 = manufactureGifts(production3)
console.log(result3)
// []