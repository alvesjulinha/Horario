print("====== ADIVINHE A SENHA ======")
senhaEscolhida = 5687
numeroTentativas = 0

while senhaUsuario ~= senhaEscolhida do
    print("Tente adivinhar a senha de 4 dígitos: ")
    numeroTentativas = numeroTentativas + 1
    senhaUsuario = tonumber(io.read())
end

if senhaEscolhida == senhaUsuario then
    print("Acertou!!!")
    print("Tentativas usadas: " .. numeroTentativas)
end
