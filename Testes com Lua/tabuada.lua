
print("Escolha 1 para continuar ou apertar qualquer outra tecla para senhaUsuario")
escolha = tonumber(io.read())

while escolha == 1 do
   print("Informe o número: ")
n1 = tonumber(io.read())

for i = 1 , 10 do
    print("Tabuada do número " .. n1 .. " : " .. n1 .. " x " ..  i .. " = " .. n1 * i)
end 

print("Escolha 1 para continuar ")
escolha = tonumber(io.read())
end