Std output when running `sbt compile` on my machine:

    [error] src/main/scala/scalaxb/error/xmlprotocol.scala:2396: type mismatch;
    [error]  found   : scalaxb.DataRecord[Any]
    [error]  required: scalaxb.DataRecord[scalaxb.error.types.SimpleLiteral]
    [error]           ((any(_ ⇒ true) ^^ (scalaxb.fromXML[scalaxb.DataRecord[Any]](_, scalaxb.ElemName(node) :: stack)))))
    [error]                                                                       ^
    [error] src/main/scala/scalaxb/error/xmlprotocol.scala:2395: type mismatch;
    [error]  found   : TypesElementsGroupGroupFormat.this.Parser[scalaxb.DataRecord[Any]]
    [error]  required: TypesElementsGroupGroupFormat.this.Parser[scalaxb.DataRecord[scalaxb.error.types.SimpleLiteral]]
    [error]           ((any(_ ⇒ true) ^^ (scalaxb.fromXML[scalaxb.DataRecord[Any]](_, scalaxb.ElemName(node) :: stack)))) |
    [error]                                                                                                               ^
    [error] src/main/scala/scalaxb/error/xmlprotocol.scala:2415: type mismatch;
    [error]  found   : scalaxb.DataRecord[Any]
    [error]  required: scalaxb.DataRecord[scalaxb.error.types.SimpleLiteral]
    [error]           ((any(_ ⇒ true) ^^ (scalaxb.fromXML[scalaxb.DataRecord[Any]](_, scalaxb.ElemName(node) :: stack)))))
    [error]                                                                       ^
    [error] src/main/scala/scalaxb/error/xmlprotocol.scala:2414: type mismatch;
    [error]  found   : TypesElementsGroupGroupFormat.this.Parser[scalaxb.DataRecord[Any]]
    [error]  required: TypesElementsGroupGroupFormat.this.Parser[scalaxb.DataRecord[scalaxb.error.types.SimpleLiteral]]
    [error]           ((any(_ ⇒ true) ^^ (scalaxb.fromXML[scalaxb.DataRecord[Any]](_, scalaxb.ElemName(node) :: stack)))) |
    [error]                                                                                                               ^
    [error] four errors found
    [error] (compile:compile) Compilation failed
    [error] Total time: 15 s, completed Nov 13, 2014 4:58:27 PM
