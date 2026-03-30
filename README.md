## ENTERPRISE STRUCTURE

sotamec-platform/
│
├── infrastructure/              # Terraform (EKS, VPC, RDS, ECR)
│   ├── modules/
│   │   ├── vpc/
│   │   ├── eks/
│   │   ├── rds/
│   │   ├── ecr/
│   │   ├── iam/
│   │   └── waf/
│   ├── envs/
│   │   ├── dev/
│   │   ├── stage/
│   │   └── prod/
│   ├── backend.tf
│   ├── providers.tf
│   ├── variables.tf
│   ├── outputs.tf
│   └── terraform.tfvars
│
├── microservices/
│   ├── api-gateway/
│   ├── auth-service/
│   ├── user-service/
│   ├── project-service/
│   ├── billing-service/
│   ├── notification-service/
│   ├── document-service/
│   ├── analytics-service/
│   └── audit-service/
│
├── k8s/
│   ├── base/
│   │   ├── namespace.yaml
│   │   ├── configmap.yaml
│   │   ├── secrets.yaml
│   │   ├── ingress.yaml
│   │   └── hpa.yaml
│   │
│   ├── services/
│   │   ├── user-service/
│   │   │   ├── deployment.yaml
│   │   │   ├── service.yaml
│   │   │   ├── hpa.yaml
│   │   │   └── configmap.yaml
│   │   └── (same for all services)
│
├── helm/
│   ├── sotamec-platform/
│   │   ├── Chart.yaml
│   │   ├── values.yaml
│   │   ├── templates/
│   │   │   ├── deployment.yaml
│   │   │   ├── service.yaml
│   │   │   ├── ingress.yaml
│   │   │   ├── hpa.yaml
│   │   │   └── _helpers.tpl
│
├── cicd/
│   ├── Jenkinsfile
│   ├── github-actions.yaml
│
├── monitoring/
│   ├── prometheus/
│   ├── grafana/
│   ├── loki/
│   └── alertmanager/
│
├── docker/
│   ├── Dockerfile.common
│
└── README.md