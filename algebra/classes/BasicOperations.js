    // importando algums recursos
import {Math} from './outros/ls.js';
const tools = new Math;

    // classe de operações básicas
export class BasicOperations {

// ===== transpor =====
    transpose(A) {
    // variáveis
        const rows = A.length;
        const columns = A[0].length;

    // criando uma matriz zerada de tamanho transposta da original
        const result = tools.template(columns, rows, 0);

    // inserindo valores da original
        for (const i of tools.range(0, rows)) {
            for (const j of tools.range(0, columns)) {
                result[j][i] = A[i][j];
            }
        }

    // retornar resultado
        return result;
    }
// ===== ===== =====

// ===== soma de matrizes 'A' e 'B' =====
    sum(A, B) {
    // variáveis para verificação
    // (organização desnecessária da minha parte viu)
        const sameLength = A.length == B.length
        const sameType = Array.isArray(A[0]) == Array.isArray(B[0])
        const valid = sameLength == sameType
        
        if (!valid) {
            print("Valores inválidos!");
            return;
        };
    
// variáveis
    const rows = A.length
    const columns = A[0].length

// criando a base para a matriz resultado
    let novaArray = tools.template(rows, columns, 0)

    // verificando se elementos internos são uma array
    // nesse caso isso significa que é uma matriz
        if (Array.isArray(A[0])) {

        // somando valores no 'resultado'
            for (const i of tools.range(0, A.length)) {
                for (const j of tools.range(0, A.length)) {
                    novaArray[i][j] = A[i][j] + B[i][j];
                }             
            }

        // retornar resultado
            return novaArray;
        }
        
    // caso elementos internos sejam, por exemplo, um int
    // nesse caso seria um vetor
        else {

        // somando valores no 'A'
            for (const i in tools.range(0, A.length)) {
                A[i] += B[i];
            }

        // retornar resultado (que no caso é 'A')
            return A
        }
    }

// ===== times =====
    times(escalar, elementos) {
    // nova array (para o resultado)
        const rows = elementos.length
        const columns = elementos[0].length

    // criando a base para o resultado
        let novaArray = tools.template(rows, columns, 0)
        
    // verificando se escalar é uma array
        if (Array.isArray(escalar)) {
            
        // verificando tamanho dos parâmetros
            if (escalar.length != elementos.length) {
                print("A quantidade de elementos no vetor deve ser == linhas da matriz")
                return;
            }

        // inserindo valores na novaArray
            for (const i in elementos) {
                for (const j in elementos) {
                    novaArray[i][j] = elementos[i][j] * escalar[i]
                }
            }

        // retornando resultado
            return novaArray;
        }

    // caso escalar não seja uma array
        else {

        // inserindo valores
            for (const i in elementos) {
                for (const j in elementos) {
                    novaArray[i][j] = elementos[i][j] * escalar
                }
            }

        // retornando resultado
            return novaArray
        }
    }

// operações 'dot'
    dot(A, B) {
    // variáveis
        const rows = A.length
        const columns = A[0].length
        let novaArray = tools.template(A.length, A[0].length)

    // inserindo valores
        for (const i of tools.range(0, rows)) {
            for (const j of tools.range(0, columns)) {
                novaArray[i][j] = A[i][j] * B[i][j]
            }
        }

    // retornando resultado
        return novaArray
    }
};