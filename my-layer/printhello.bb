DESCRIPTION = "Drukuje tekst"
PN = "printhello"
PV = "1.0"

python do_build() {
       bb.plain("**************************");
       bb.plain("*      hello world       *");
       bb.plain("**************************");
}