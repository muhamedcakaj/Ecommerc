Projekti ynë E-commerce ofron funksionalitete të ndryshme si:
- Regjistrimi dhe hyrja e përdoruesve.
- Shfletimi i produkteve të ndryshme të ofruara nga faqja.
- Veçimi i produkteve sipas kategorive të ofruara.
- Vendosja e produkteve në shportë dhe lista e dëshirave.
- Ndryshimi i sasisë së produkteve në shportë.
- Shikimi i historikut dhe statusit të porosive.
- Përdoruesit kanë mundësinë të lënë një mesazh duke vlerësuar punën e kompanisë.

Projekti ynë është i siguruar përmes një sistemi të avancuar të autentifikimit dhe autorizimit:
- Përdorimi i token-eve JWT për autentifikim dhe rifreskim, ku token-et përmbajnë informacione për username-in dhe rolin e përdoruesit.
- Token-et e aksesit janë të vlefshme për një ditë, ndërsa token-et e rifreskimit për një javë, me një mekanizëm për rifreskimin e tyre çdo 10 minuta.
- Gjithashtu, kemi implementuar një filtër autentifikimi që verifikon çdo kërkesë për vlefshmërinë e token-it dhe ngarkon detajet e përdoruesit në kontekstin e sigurisë.
- Për të siguruar ruajtjen e sigurt të fjalëkalimeve, përdorim `BCryptPasswordEncoder` për enkodimin e tyre.

Përveç kësaj, është implementuar edhe një admin dashboard që ofron operacione CRUD për të gjitha entitetet, duke e bërë menaxhimin e sistemit më të lehtë dhe të përshtatshëm për administratorët.

Teknologjit:
Front-end: React.js
Back-end: Java Spring Boot
Styling: TailwindCSS
Database: MySQL
