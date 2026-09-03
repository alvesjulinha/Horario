--Calculadora simples
print("======CALCULADORA======")


print("Informe o primeiro número: ")
n1 = tonumber(io.read())


print("Informe o primeiro número: ")
n2 = tonumber(io.read())


print("Informe o tipo de operação: 1 - Adição, 2 - Subtração")
sinal = tonumber(io.read())


if sinal == 1 then
    print("O resultado da adição é: " .. n1 .. " + " .. n2 .. " = " .. n1 + n2)
    elseif sinal == 2 then
        print("O resultado da subtração é: " .. n1 .. " + " .. n2 .. " = " .. n1 - n2)
end


