
--Sistema de vida
saudeAtual = 100
if saudeAtual > 100 then
  saudeAtual = 100
  elseif saudeAtual < 0 then
    saudeAtual = 0
    end


  print("A saúde atual do jogador é de " .. saudeAtual .. "%")


function curarVida(curativo)
  saudeAtual = (saudeAtual + curativo) 
  print("O jogador se curou e sua barra de vida subiu para " .. (saudeAtual) .. "%")
end

function causarDano(dano)
  saudeAtual = (saudeAtual - dano ) 
  print("O jogador se feriu e sua barra de vida caiu para " .. (saudeAtual) .. "%")
end

causarDano(20)
curarVida(15)
causarDano(100)

if saudeAtual <= 0 then
  print("O jogador morreu")
end