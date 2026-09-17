#!/bin/sh
# Compila o projeto com o JDK, sem dependências externas ou Maven instalado.
set -eu
cd "$(dirname "$0")/.."
if ! command -v javac >/dev/null 2>&1; then
    echo "Instale um JDK 17 ou superior e disponibilize javac no PATH." >&2
    exit 1
fi
mkdir -p target/classes
find src/main/java -name '*.java' -type f | sort > target/fontes.txt
javac --release 17 -encoding UTF-8 -Xlint:all -Werror -d target/classes @target/fontes.txt
echo "Compilação concluída: target/classes (Java 17)."
