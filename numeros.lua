print("Escolha 1 para continuar ou apertar qualquer outra tecla para parar")
escolha = tonumber(io.read())

while escolha == 1 do
   print("Informe o número: ")
n1 = tonumber(io.read())

local function umAN(n) --Faz a contagem de 1 até n
    for i = 1, n1, 1 do
        print(i)
    end
end

local function tabuada(n) --Faz a tabuada do número n
    for i = 1 , 10 do
        print("Tabuada do número " .. n .. " : " .. n .. " x " ..  i .. " = " .. n * i)
    end 
end

local function somaN() --Faz a soma de 1 até n
    local soma = 0
    for i = 1, n1, 1 do
        soma = soma + i
    end
    print("A soma de 1 até " .. n1 .. " é: " .. soma)
    
end

local function somaParesN() --Faz a soma dos números pares, 1 até n
    local soma = 0
    for i = 1, n1, 1 do
        if i % 2 == 0 then
            soma = soma + i
        end
    end
    print("A soma dos números pares de 1 até " .. n1 .. " é: " .. soma)
end

local function fatorial()
    local fatorial = 1
    for i = 1, n1, 1 do
    fatorial = fatorial * i
    end
    print("O fatorial de " .. n1 .. " é: " .. fatorial)
end
print("========CONTAGEM DE 1 ATÉ N========")
umAN(n1)
print( )
print("========SOMA DE 1 ATÉ N========")
somaN(n1)
print( )
print("========SOMA DOS PARES DE 1 ATÉ N========")
somaParesN(n1)
print( )
print("========TABUADA DO NÚMERO========")
tabuada(n1)
print( )
print("========FATORIAL DO NÚMERO========")
fatorial(n1)
end
