#!/usr/bin/env bash

readonly XSD_DIR=xsds
readonly SRC_DIR=src/main/scala/
readonly PACKAGE=scalaxb.error

rm    -rf "$SRC_DIR"
mkdir -p  "$SRC_DIR"
touch "$SRC_DIR/.keep"

CMD='scalaxb -d "$SRC_DIR" -p "$PACKAGE.types" --package-dir --protocol-package "$PACKAGE" "$XSD_DIR"/*.xsd'

echo
echo "Building src... '$CMD'"
echo
eval $CMD
