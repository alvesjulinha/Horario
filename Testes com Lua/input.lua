--Sistema de notas

numeroNotas = 3 

print("Informe a primeira nota: ")
nota1 = tonumber(io.read())

print("Informe a primeira nota: ")
nota2 = tonumber(io.read())

print("Informe a terceira nota: ")
nota3 = tonumber(io.read())

media = (nota1 + nota2 + nota3) / numeroNotas

if media >= 70 then
    print("Aluno com média " .. media .. ", aprovado ")

    elseif media > 50 and media < 70 then
        print("Aluno com média " .. media .. ", em recuperção ")

        elseif media < 50 then
            print("Aluno com média " .. media .. ", reprovado ")
            
end

--Eu poderia pedir para o usuário escolher o número de matérias também