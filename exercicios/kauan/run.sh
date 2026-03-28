#!/usr/bin/env bash
set -euo pipefail

COMPILER=g++
STD=-std=c++17
WARNINGS="-Wall -Wextra -Wpedantic"
DEBUG=-g
OUTPUT=programa

INCLUDES="-I."

SRC_FILES=$(find . -type f -name "*.cpp")

$COMPILER $STD $WARNINGS $DEBUG $INCLUDES \
    $SRC_FILES \
    -o $OUTPUT

./$OUTPUT