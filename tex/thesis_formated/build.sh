#!/bin/bash

echo "==============================================="
echo "LaTeX Build Script for Thesis"
echo "==============================================="
echo

MAIN_FILE="main"

echo "[1/5] Running initial pdflatex compilation..."
pdflatex -interaction=nonstopmode "$MAIN_FILE.tex"
if [ $? -ne 0 ]; then
    echo "ERROR: Initial pdflatex compilation failed!"
    exit 1
fi

echo
echo "[2/5] Processing bibliography with biber..."
biber "$MAIN_FILE"
if [ $? -ne 0 ]; then
    echo "ERROR: Biber processing failed!"
    exit 1
fi

echo
echo "[3/5] Processing glossaries and acronyms..."
makeglossaries "$MAIN_FILE"
if [ $? -ne 0 ]; then
    echo "ERROR: Makeglossaries processing failed!"
    exit 1
fi

echo
echo "[4/5] Running second pdflatex compilation..."
pdflatex -interaction=nonstopmode "$MAIN_FILE.tex"
if [ $? -ne 0 ]; then
    echo "ERROR: Second pdflatex compilation failed!"
    exit 1
fi

echo
echo "[5/5] Running final pdflatex compilation..."
pdflatex -interaction=nonstopmode "$MAIN_FILE.tex"
if [ $? -ne 0 ]; then
    echo "ERROR: Final pdflatex compilation failed!"
    exit 1
fi

echo
echo "==============================================="
echo "BUILD COMPLETED SUCCESSFULLY!"
echo "Generated: $MAIN_FILE.pdf"
echo "==============================================="

echo
echo "Cleaning up auxiliary files..."
rm -f *.aux *.log *.out *.toc *.lof *.lot *.bbl *.bcf *.blg *.run.xml *.fdb_latexmk *.fls *.synctex.gz *.alg *.acn *.glo *.ist 2>/dev/null

echo "Build complete!"

# Try to open PDF (works on most systems)
if command -v xdg-open > /dev/null; then
    xdg-open "$MAIN_FILE.pdf"
elif command -v open > /dev/null; then
    open "$MAIN_FILE.pdf"
fi
