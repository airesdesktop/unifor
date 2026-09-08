    // imports
import * as BasicOperations from "../classes/operations.basic.js";
const operations = new BasicOperations();

    // valores para testes
const matrizTeste = [
    [1, 2, 3],
    [4, 5, 6],
    [7, 8, 9]
];

const vetorTeste = [1, 2, 3]

    // operações
console.log(operations.times(vetorTeste, matrizTeste))
console.log(operations.dot(matrizTeste, matrizTeste))
console.log(operations.sum(matrizTeste, matrizTeste))
console.log(operations.transpose(matrizTeste))