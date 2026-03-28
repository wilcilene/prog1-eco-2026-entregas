@echo off
setlocal enabledelayedexpansion

REM Configurações
set COMPILER=g++
set STD=-std=c++17
set WARNINGS=-Wall -Wextra -Wpedantic
set DEBUG=-g
set OUTPUT=programa.exe
set INCLUDES=-I.

REM Coletar todos os arquivos .cpp recursivamente
set SRC_FILES=

for /r %%f in (*.cpp) do (
    set SRC_FILES=!SRC_FILES! "%%f"
)

REM Compilar
%COMPILER% %STD% %WARNINGS% %DEBUG% %INCLUDES% %SRC_FILES% -o %OUTPUT%

REM Executar se compilou com sucesso
if %errorlevel%==0 (
    echo Executando...
    %OUTPUT%
) else (
    echo Erro na compilação.
)

endlocal